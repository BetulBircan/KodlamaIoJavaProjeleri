public class Main {

    public static void main(String[] args) {

        Courses course1 = new Courses(1, "Yazılım Geliştirme Kampı(JAVA + REACT)", "15 DERS",
                "ENGİN DEMİROĞ" );

        Courses course2 = new Courses(2, "Yazılım Geliştirme Kampı(JavaScript)", "4 DERS",
                "ENGİN DEMİROĞ");

        Courses course3 = new Courses(3, "Yazılım Geliştirme Kampı(C# + ANGULAR)", "18 DERS",
                "ENGİN DEMİROĞ");

        Courses course4 = new Courses(4, "Proglamaya Giriş İçin Temel Kurs", "7 DERS",
                "ENGİN DEMİROĞ");

        Courses[] courses = {course1, course2, course3, course4};

        for (Courses course: courses) {
            System.out.println("Kurs ID: " + course.id + "  " +  "Kurs Adı: " +  course.name
                    + "  " + "Ders: " +course.lessons + "  " + "Eğitmen: " + course.instructor
            );
        }

    }
}
