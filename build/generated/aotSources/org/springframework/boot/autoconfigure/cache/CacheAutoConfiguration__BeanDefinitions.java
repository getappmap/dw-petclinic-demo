package org.springframework.boot.autoconfigure.cache;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CacheAutoConfiguration}.
 */
@Generated
public class CacheAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'cacheAutoConfiguration'.
   */
  public static BeanDefinition getCacheAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CacheAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cacheManagerCustomizers'.
   */
  private static BeanInstanceSupplier<CacheManagerCustomizers> getCacheManagerCustomizersInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CacheManagerCustomizers>forFactoryMethod(CacheAutoConfiguration.class, "cacheManagerCustomizers", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration", CacheAutoConfiguration.class).cacheManagerCustomizers(args.get(0)));
  }

  /**
   * Get the bean definition for 'cacheManagerCustomizers'.
   */
  public static BeanDefinition getCacheManagerCustomizersBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheManagerCustomizers.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration");
    beanDefinition.setInstanceSupplier(getCacheManagerCustomizersInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cacheAutoConfigurationValidator'.
   */
  private static BeanInstanceSupplier<CacheAutoConfiguration.CacheManagerValidator> getCacheAutoConfigurationValidatorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CacheAutoConfiguration.CacheManagerValidator>forFactoryMethod(CacheAutoConfiguration.class, "cacheAutoConfigurationValidator", CacheProperties.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration", CacheAutoConfiguration.class).cacheAutoConfigurationValidator(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'cacheAutoConfigurationValidator'.
   */
  public static BeanDefinition getCacheAutoConfigurationValidatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheAutoConfiguration.CacheManagerValidator.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration");
    beanDefinition.setInstanceSupplier(getCacheAutoConfigurationValidatorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link CacheAutoConfiguration.CacheManagerEntityManagerFactoryDependsOnPostProcessor}.
   */
  @Generated
  public static class CacheManagerEntityManagerFactoryDependsOnPostProcessor {
    /**
     * Get the bean definition for 'cacheManagerEntityManagerFactoryDependsOnPostProcessor'.
     */
    public static BeanDefinition getCacheManagerEntityManagerFactoryDependsOnPostProcessorBeanDefinition(
        ) {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheAutoConfiguration.CacheManagerEntityManagerFactoryDependsOnPostProcessor.class);
      beanDefinition.setInstanceSupplier(CacheAutoConfiguration.CacheManagerEntityManagerFactoryDependsOnPostProcessor::new);
      return beanDefinition;
    }
  }
}
