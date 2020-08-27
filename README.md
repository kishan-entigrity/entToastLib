# entToastLib

Hello world this is my first ever android lib for the Toast messages with two methods for short and long toast message:

Add it to your root build.gradle at the end of repositories:

    repositories {
        ...
        
        maven { url 'https://jitpack.io' } 
    }
    
Add the dependency:

    dependencies {
        ...
        
        implementation 'com.github.kishan-entigrity:entToastLib:Tag'
    }
    
Use code in your class:

    ToastMessage.s(this, "Use this function for short toast message");
    ToastMessage.longToast(this,"Use this function for long toast message");
