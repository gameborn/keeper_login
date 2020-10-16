package com.gameborn.keeperlogin.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebserviceModule_ProvideRetrofitClientFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return provideRetrofitClient();
  }

  public static WebserviceModule_ProvideRetrofitClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit provideRetrofitClient() {
    return Preconditions.checkNotNull(WebserviceModule.INSTANCE.provideRetrofitClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final WebserviceModule_ProvideRetrofitClientFactory INSTANCE = new WebserviceModule_ProvideRetrofitClientFactory();
  }
}
