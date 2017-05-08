package org.wordpress.android.ui.accounts.login.nav;

public interface LoginNav {
    interface Prologue extends LoginNav {
        void doStartLogin();
        void doStartSignup();
    }

    interface InputEmail extends LoginNav {
        void gotEmail(String email);
        void loginViaUsernamePassword();

        void help();
    }

    interface RequestMagicLink extends LoginNav {
        void sendMagicLinkRequest(String email);
        void usePasswordInstead(String email);

        void help();
    }

    interface InputSiteAddress extends LoginNav {
        void gotSiteAddress(String siteAddress);
    }
}
