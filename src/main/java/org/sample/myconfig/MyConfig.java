//package org.sample.myconfig;
//
//import org.hibernate.validator.HibernateValidator;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
//
//import javax.validation.Validation;
//import javax.validation.Validator;
//import javax.validation.ValidatorFactory;
//
//@Configuration
//public class MyConfig {
//
//    @Bean(name = "validator")
//    public Validator validator() {
//        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
//                .configure()
//                //failFast的意思只要出现校验失败的情况，就立即结束校验，不再进行后续的校验。
//                .failFast(false)
//                .buildValidatorFactory();
//
//        Validator validator = validatorFactory.getValidator();
//        return validator;
//
//    }
//
//
//    @Bean
//    public MethodValidationPostProcessor methodValidationPostProcessor() {
//        MethodValidationPostProcessor methodValidationPostProcessor = new MethodValidationPostProcessor();
//        methodValidationPostProcessor.setValidator(validator());
//        return methodValidationPostProcessor;
//    }
//
//
//}
