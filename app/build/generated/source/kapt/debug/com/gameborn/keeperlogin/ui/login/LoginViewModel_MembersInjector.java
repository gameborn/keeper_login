package com.gameborn.keeperlogin.ui.login;

import androidx.lifecycle.MutableLiveData;
import com.gameborn.keeperlogin.data.UserLoginData;
import com.gameborn.keeperlogin.di.api.WebAPI;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_MembersInjector implements MembersInjector<LoginViewModel> {
  private final Provider<MutableLiveData<UserLoginData>> userLoginDataProvider;

  private final Provider<WebAPI> webAPIProvider;

  public LoginViewModel_MembersInjector(
      Provider<MutableLiveData<UserLoginData>> userLoginDataProvider,
      Provider<WebAPI> webAPIProvider) {
    this.userLoginDataProvider = userLoginDataProvider;
    this.webAPIProvider = webAPIProvider;
  }

  public static MembersInjector<LoginViewModel> create(
      Provider<MutableLiveData<UserLoginData>> userLoginDataProvider,
      Provider<WebAPI> webAPIProvider) {
    return new LoginViewModel_MembersInjector(userLoginDataProvider, webAPIProvider);}

  @Override
  public void injectMembers(LoginViewModel instance) {
    injectUserLoginData(instance, userLoginDataProvider.get());
    injectWebAPI(instance, webAPIProvider.get());
  }

  @InjectedFieldSignature("com.gameborn.keeperlogin.ui.login.LoginViewModel.userLoginData")
  public static void injectUserLoginData(LoginViewModel instance,
      MutableLiveData<UserLoginData> userLoginData) {
    instance.userLoginData = userLoginData;
  }

  @InjectedFieldSignature("com.gameborn.keeperlogin.ui.login.LoginViewModel.webAPI")
  public static void injectWebAPI(LoginViewModel instance, WebAPI webAPI) {
    instance.webAPI = webAPI;
  }
}
