package com.gameborn.keeperlogin.data;

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
public final class UserLoginData_Factory implements Factory<UserLoginData> {
  private final Provider<String> loginProvider;

  private final Provider<String> passwordProvider;

  private final Provider<String> tokenProvider;

  public UserLoginData_Factory(Provider<String> loginProvider, Provider<String> passwordProvider,
      Provider<String> tokenProvider) {
    this.loginProvider = loginProvider;
    this.passwordProvider = passwordProvider;
    this.tokenProvider = tokenProvider;
  }

  @Override
  public UserLoginData get() {
    return newInstance(loginProvider.get(), passwordProvider.get(), tokenProvider.get());
  }

  public static UserLoginData_Factory create(Provider<String> loginProvider,
      Provider<String> passwordProvider, Provider<String> tokenProvider) {
    return new UserLoginData_Factory(loginProvider, passwordProvider, tokenProvider);
  }

  public static UserLoginData newInstance(String login, String password, String token) {
    return new UserLoginData(login, password, token);
  }
}
