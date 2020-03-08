public class Movie {
    String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return this.getClass().getSimpleName() + " is a good movie.";
    }
}

class Matrix extends Movie {
    public Matrix() {
        super("Matrix");
    }
}

class LordOfTheRings extends Movie {
    public LordOfTheRings() {
        super("LordOfTheRings");
    }
}

class Inception extends Movie {
    public Inception() {
        super("Inception");
    }
}

class Titanic extends Movie {
    public Titanic() {
        super("Titanic");
    }
}

class Interstellar extends Movie {
    public Interstellar() {
        super("Interstellar");
    }
}

class RandomMovie {
    public static void main(String[] args) {
        int count = (int) (Math.random() * 10);

        for (int i = 1; i <= count; i++) {
            Movie movie = RandomMovie.getRandomMovie();
            if (movie != null) {
                System.out.println("Movie #" + i + " is " + movie.getName() + " and " + movie.getRating());
            }
        }
    }

    public static Movie getRandomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1: return new Matrix();
            case 2: return new LordOfTheRings();
            case 3: return new Inception();
            case 4: return new Titanic();
            case 5: return new Interstellar();
        }

        return null;
    }
}