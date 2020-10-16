package com.gameborn.keeperlogin.ui.login;

import androidx.lifecycle.MutableLiveData;
import com.gameborn.keeperlogin.data.UserLoginData;
import com.gameborn.keeperlogin.di.api.WebAPI;
import dagger.internal.Factory;
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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<MutableLiveData<UserLoginData>> userLoginDataProvider;

  private final Provider<WebAPI> webAPIProvider;

  public LoginViewModel_Factory(Provider<MutableLiveData<UserLoginData>> userLoginDataProvider,
      Provider<WebAPI> webAPIProvider) {
    this.userLoginDataProvider = userLoginDataProvider;
    this.webAPIProvider = webAPIProvider;
  }

  @Override
  public LoginViewModel get() {
    LoginViewModel instance = newInstance();
    LoginViewModel_MembersInjector.injectUserLoginData(instance, userLoginDataProvider.get());
    LoginViewModel_MembersInjector.injectWebAPI(instance, webAPIProvider.get());
    return instance;
  }

  public static LoginViewModel_Factory create(
      Provider<MutableLiveData<UserLoginData>> userLoginDataProvider,
      Provider<WebAPI> webAPIProvider) {
    return new LoginViewModel_Factory(userLoginDataProvider, webAPIProvider);
  }

  public static LoginViewModel newInstance() {
    return new LoginViewModel();
  }
}
