package org.springframework.boot.actuate.autoconfigure.sbom;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.sbom.SbomEndpoint;
import org.springframework.boot.actuate.sbom.SbomEndpointWebExtension;
import org.springframework.boot.actuate.sbom.SbomProperties;
import org.springframework.core.io.ResourceLoader;

/**
 * Bean definitions for {@link SbomEndpointAutoConfiguration}.
 */
@Generated
public class SbomEndpointAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.actuate.autoconfigure.sbom.SbomEndpointAutoConfiguration'.
   */
  private static BeanInstanceSupplier<SbomEndpointAutoConfiguration> getSbomEndpointAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SbomEndpointAutoConfiguration>forConstructor(SbomProperties.class)
            .withGenerator((registeredBean, args) -> new SbomEndpointAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'sbomEndpointAutoConfiguration'.
   */
  public static BeanDefinition getSbomEndpointAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SbomEndpointAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(getSbomEndpointAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'sbomEndpoint'.
   */
  private static BeanInstanceSupplier<SbomEndpoint> getSbomEndpointInstanceSupplier() {
    return BeanInstanceSupplier.<SbomEndpoint>forFactoryMethod(SbomEndpointAutoConfiguration.class, "sbomEndpoint", ResourceLoader.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.sbom.SbomEndpointAutoConfiguration", SbomEndpointAutoConfiguration.class).sbomEndpoint(args.get(0)));
  }

  /**
   * Get the bean definition for 'sbomEndpoint'.
   */
  public static BeanDefinition getSbomEndpointBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SbomEndpoint.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.sbom.SbomEndpointAutoConfiguration");
    beanDefinition.setInstanceSupplier(getSbomEndpointInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'sbomEndpointWebExtension'.
   */
  private static BeanInstanceSupplier<SbomEndpointWebExtension> getSbomEndpointWebExtensionInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SbomEndpointWebExtension>forFactoryMethod(SbomEndpointAutoConfiguration.class, "sbomEndpointWebExtension", SbomEndpoint.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.sbom.SbomEndpointAutoConfiguration", SbomEndpointAutoConfiguration.class).sbomEndpointWebExtension(args.get(0)));
  }

  /**
   * Get the bean definition for 'sbomEndpointWebExtension'.
   */
  public static BeanDefinition getSbomEndpointWebExtensionBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SbomEndpointWebExtension.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.sbom.SbomEndpointAutoConfiguration");
    beanDefinition.setInstanceSupplier(getSbomEndpointWebExtensionInstanceSupplier());
    return beanDefinition;
  }
}
