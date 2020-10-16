package com.gameborn.keeperlogin.di;

import androidx.lifecycle.MutableLiveData;
import com.gameborn.keeperlogin.data.UserLoginData;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserLoginModule_ProvideUserLoginDataFactory implements Factory<MutableLiveData<UserLoginData>> {
  @Override
  public MutableLiveData<UserLoginData> get() {
    return provideUserLoginData();
  }

  public static UserLoginModule_ProvideUserLoginDataFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MutableLiveData<UserLoginData> provideUserLoginData() {
    return Preconditions.checkNotNull(UserLoginModule.INSTANCE.provideUserLoginData(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final UserLoginModule_ProvideUserLoginDataFactory INSTANCE = new UserLoginModule_ProvideUserLoginDataFactory();
  }
}
