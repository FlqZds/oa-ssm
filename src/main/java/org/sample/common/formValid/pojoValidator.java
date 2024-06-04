//package org.sample.common.formValid;
//
//import org.hibernate.validator.HibernateValidator;
//import org.springframework.stereotype.Component;
//
//import javax.validation.Constraint;
//import javax.validation.ConstraintViolation;
//import javax.validation.Validation;
//import javax.validation.Validator;
//import java.util.Set;
//
//
//@Component
//public class pojoValidator {
//    private static Validator validator = Validation.byProvider(HibernateValidator.class).configure().failFast(true).buildValidatorFactory().getValidator();
//
//    public static <T> boolean validate(T pojo) {
//
//        Set<ConstraintViolation<T>> validationResult = validator.validate(pojo);
//        if (validationResult.size() > 0) {
//            System.out.println(validationResult.iterator().next().getMessage()+"\n,校验失败");
//            return false;
//        }
//        return true;
//    }
//}
