package org.springframework.boot.autoconfigure.context;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MessageSourceProperties}.
 */
@Generated
public class MessageSourceProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'messageSourceProperties'.
   */
  public static BeanDefinition getMessageSourcePropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MessageSourceProperties.class);
    beanDefinition.setInstanceSupplier(MessageSourceProperties::new);
    return beanDefinition;
  }
}
