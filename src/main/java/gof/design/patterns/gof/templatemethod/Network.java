package gof.design.patterns.gof.templatemethod;

/**
 * Base class of social network.
 */
public abstract class Network {

    private String userName;
    private String password;

    Network() {
    }

    public String getUserName() {
        return userName;
    }

    public Network setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Network setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Publish the data to whatever network.
     */
    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract void logOut();

}
