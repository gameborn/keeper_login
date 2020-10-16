package com.gameborn.keeperlogin.ui.login

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.gameborn.keeperlogin.R
import com.gameborn.keeperlogin.data.LoginResult
import com.gameborn.keeperlogin.data.LoginValidationResult
import com.gameborn.keeperlogin.databinding.LoginFragmentBinding
import com.gameborn.keeperlogin.ext.PASSWORD_MINIMUM_SYMBOLS
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Starting view of the application LoginFragment
 * @viewModel - dependency injection of LoginViewModel
 * @binding - binds to the view and gives and access to all controls of R.layout.login_fragment
 * @nacController - Navigation controller us used to switch between fragments
 */
@AndroidEntryPoint
class LoginFragment : Fragment() {


    @Inject
    lateinit var viewModel: LoginViewModel

    private lateinit var binding: LoginFragmentBinding
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = LoginFragmentBinding.inflate(inflater)
        navController = findNavController()

        initialize()

        return binding.root
    }

    /**
     * Initialize all bindings and properties
     */
    private fun initialize()
    {

        binding.needHelpLink.movementMethod = LinkMovementMethod.getInstance()
        binding.createAccountLink.movementMethod = LinkMovementMethod.getInstance()

        //set onClick for Login button
        binding.loginButton.setOnClickListener {handleLoginButtonClick(it)}

        //Subscribe on data changes in injected viewModel for login/password data fields
        viewModel.validationResult.observe(viewLifecycleOwner, getObserverForLoginValidation())
        //Subscribe on login result
        viewModel.loginResult.observe(viewLifecycleOwner, getObserverForLoginResult())

        //update data in viewModel whenever user types in login field
        binding.userLoginText.doAfterTextChanged {
            updateUserLoginData()
        }

        //update data in viewModel whenever user types in password field
        binding.userPasswordText.doAfterTextChanged {
            updateUserLoginData()
        }

        //handle error messages and hints when login text field loses its focus
        binding.userLoginText.setOnFocusChangeListener { view, hasFocus ->
            if(hasFocus)
            {
                //clear error hint text
                binding.loginErrorHintText.setText(R.string.empty_value)
            }
        }

        //handle error messages and hints when login text field loses its focus
        binding.userPasswordText.setOnFocusChangeListener { view, hasFocus ->
            if(hasFocus)
            {
                //clear error hint text
                binding.passwordErrorHintText.setText(R.string.empty_value)
            }
        }

        //handle keyboard 'enter' button click. When user able to use 'Enter' button on keyboard it imitates loginButton click event
        binding.userPasswordText.setOnEditorActionListener { textView, actionId, keyEvent ->
            if ((keyEvent != null && (keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
                performLoginAction()
            }
            return@setOnEditorActionListener false
        }




    }

    fun updateUserLoginData()
    {
        viewModel.loginDataChanged(binding.userLoginText.text.toString(),
            binding.userPasswordText.text.toString())
    }

    //TODO: Show ProgressBar while login request is in process
    fun showProgressBar()
    {

    }

    /**
     * performLoginAction - when login button is clicked. Clear error text fields and call for login method
     */
    private fun performLoginAction()
    {
        binding.loginErrorHintText.setText(R.string.empty_value)
        binding.passwordErrorHintText.setText(R.string.empty_value)

        viewModel.login()
    }

    /**
     * handleLoginButtonClick - on LoginButton click
     * @view - loginButton
     */
    private fun handleLoginButtonClick(view: View)
    {
        performLoginAction()

    }

    /**
     * getObserverForLoginResult - Provides Observer to handle LoginResult property change
     * //TODO:REFACTOR WHEN REAL LOGIN SERVICE WOULD BE AVAILABLE
     */

    private fun getObserverForLoginResult(): Observer<LoginResult>
    {
        return Observer {

            //
            if(it.isSuccess())
            {
                //DO LOGIN ON SUCCESS
            }

            handleOnSuccessLogin()
        }
    }

    /**
     * getObserverForLoginValidation - provides Observer to handle LoginValidationResult changes
     */
    private fun getObserverForLoginValidation(): Observer<LoginValidationResult>
    {
        return Observer {

            if (it == null) return@Observer

            //Show error message if login validation failed
            it.loginErrorMessage?.let {
                binding.userLoginText.setText(R.string.empty_value)
                binding.loginErrorHintText.setText(it)
            }

            //Show error message if password validation failed
            it.passwordErrorMessage?.let {
                binding.userPasswordText.setText(R.string.empty_value)
                binding.passwordErrorHintText.text = resources.getString(R.string.password_validation_error, PASSWORD_MINIMUM_SYMBOLS)

            }
        }
    }

    /**
     * handleOnSuccessLogin - perform transition between fragments
     */
    private fun handleOnSuccessLogin()
    {
        navController.navigate(R.id.action_loginFragment_to_registerFragment)
    }

}