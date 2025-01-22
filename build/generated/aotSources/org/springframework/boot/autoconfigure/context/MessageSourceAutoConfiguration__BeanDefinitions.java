package org.springframework.boot.autoconfigure.context;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.MessageSource;

/**
 * Bean definitions for {@link MessageSourceAutoConfiguration}.
 */
@Generated
public class MessageSourceAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'messageSourceAutoConfiguration'.
   */
  public static BeanDefinition getMessageSourceAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MessageSourceAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(MessageSourceAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'messageSource'.
   */
  private static BeanInstanceSupplier<MessageSource> getMessageSourceInstanceSupplier() {
    return BeanInstanceSupplier.<MessageSource>forFactoryMethod(MessageSourceAutoConfiguration.class, "messageSource", MessageSourceProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration", MessageSourceAutoConfiguration.class).messageSource(args.get(0)));
  }

  /**
   * Get the bean definition for 'messageSource'.
   */
  public static BeanDefinition getMessageSourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MessageSource.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration");
    beanDefinition.setInstanceSupplier(getMessageSourceInstanceSupplier());
    return beanDefinition;
  }
}
