package com.gameborn.keeperlogin.di;

import com.gameborn.keeperlogin.di.api.WebAPI;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebserviceModule_ProvideUsersAPIFactory implements Factory<WebAPI> {
  private final Provider<Retrofit> retrofitProvider;

  public WebserviceModule_ProvideUsersAPIFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public WebAPI get() {
    return provideUsersAPI(retrofitProvider.get());
  }

  public static WebserviceModule_ProvideUsersAPIFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new WebserviceModule_ProvideUsersAPIFactory(retrofitProvider);
  }

  public static WebAPI provideUsersAPI(Retrofit retrofit) {
    return Preconditions.checkNotNull(WebserviceModule.INSTANCE.provideUsersAPI(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
