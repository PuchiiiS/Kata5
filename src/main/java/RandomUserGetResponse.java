import java.util.List;

public class RandomUserGetResponse {
    private List<User> results;

    public List<User> results() {
        return results;
    }

    public void setResults(List<User> results) {
        this.results = results;
    }

    public static class User {
        private String gender;
        private Name name;
        private String email;
        private String phone;
        private Location location;

        public String gender() {
            return gender;
        }

        public Name name() {
            return name;
        }

        public String email() {
            return email;
        }

        public String phone() {
            return phone;
        }

        public Location location() {
            return location;
        }
    }

    public static class Name {
        private String title;
        private String first;
        private String last;

        public String title() {
            return title;
        }

        public String first() {
            return first;
        }

        public String last() {
            return last;
        }
    }

    public static class Location {
        private String city;
        private String country;

        public String city() {
            return city;
        }

        public String country() {
            return country;
        }
    }
}
