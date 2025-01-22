package org.springframework.boot.actuate.sbom;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SbomProperties}.
 */
@Generated
public class SbomProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'sbomProperties'.
   */
  public static BeanDefinition getSbomPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SbomProperties.class);
    beanDefinition.setInstanceSupplier(SbomProperties::new);
    return beanDefinition;
  }
}
