package com.NullPointer.CoreDefine;

/**
 * Created by Aaron on 11/18/16.
 */



public class CoreDefine {

   public static enum AccountType {
        INDIVIDUAL(0), ENTERPRISE(1);
        private int n_code;

        AccountType(int n_code) {
            this.n_code = n_code;
        }
    }
    public enum Gender{
        male(0),female(1);

        private int n_code;

        private Gender(int n_code){
            this.n_code = n_code;
        }
    }

    public enum LanguageType{

        JAVA(0),GO(1),HTML(2),JAVASCRIPT(3),CSS(4),NODE_JS(5),OBJECTIVE_C(6),SWIFT(7),PHP(8);

        private int n_code;

        LanguageType(int n_code) {
            this.n_code = n_code;
        }
    }

    public enum WorkType{

        IOS_DEVELOPEMENT(0),ANDROID_DEVELOPEMENT(1),WEB_DEVELOPEMENT(2),DATABASE_DESIGN(3),SYSTEM_DESIGN(4);

        private int n_code;

        WorkType(int n_code) {
            this.n_code = n_code;
        }
    }
}
