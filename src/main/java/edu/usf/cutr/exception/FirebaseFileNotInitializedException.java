package edu.usf.cutr.exception;

public class FirebaseFileNotInitializedException extends Exception {
    public FirebaseFileNotInitializedException() {
        super("Firebase file is not initialized.");
    }
}
