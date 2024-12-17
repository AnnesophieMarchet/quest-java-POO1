public class Wilder {
    String firstname;
    boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public String setFirstname(String firstname) {
     return   this.firstname = firstname;
    };

    public boolean setAware(boolean aware) {
        return this.aware = aware;
    };

    public String whoAmI() {
        if (isAware()) {
            return "Je m'appelle " + getFirstname() + " et je suis aware!!";
        } else {
            return "Je m'appelle " + getFirstname() + " et je ne suis pas aware !!!";
        }
    };
}
