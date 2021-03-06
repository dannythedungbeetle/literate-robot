package com.dan.data.springdataexample;

import com.dan.data.springdataexample.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class StudentTests {

    @Autowired
    StudentRepository repo;

    @Test
    void contextLoads() {
    }


//    @Test
//    public void testCreate() {
//        List<String> firstNames = getFirstNames();
//        List<String> lastNames = getLasNames();
//
//        for (int i = 0; i < firstNames.size(); i++) {
//            int randomScore = (int) (Math.random() * 100 + 1);
//            Student s = new Student();
//            // Student.builder().score(randomScore).firstName(firstNames.get(i)).lastName(lastNames.get(i)).build();
//            s.setFirstName(firstNames.get(i));
//            s.setLastName(lastNames.get(i));
//            s.setScore(randomScore);
//            repo.save(s);
//        }
//    }

    public List<String> getFirstNames() {
        String[] arr = {"Michael", "Christopher", "Jessica", "Matthew", "Ashley", "Jennifer", "Joshua", "Amanda", "Daniel", "David", "James", "Robert", "John", "Joseph", "Andrew", "Ryan", "Brandon", "Jason", "Justin", "Sarah", "William", "Jonathan", "Stephanie", "Brian", "Nicole", "Nicholas", "Anthony", "Heather", "Eric", "Elizabeth", "Adam", "Megan", "Melissa", "Kevin", "Steven", "Thomas", "Timothy", "Christina", "Kyle", "Rachel", "Laura", "Lauren", "Amber", "Brittany", "Danielle", "Richard", "Kimberly", "Jeffrey", "Amy", "Crystal", "Michelle", "Tiffany", "Jeremy", "Benjamin", "Mark", "Emily", "Aaron", "Charles", "Rebecca", "Jacob", "Stephen", "Patrick", "Sean", "Erin", "Zachary", "Jamie", "Kelly", "Samantha", "Nathan", "Sara", "Dustin", "Paul", "Angela", "Tyler", "Scott", "Katherine", "Andrea", "Gregory", "Erica", "Mary", "Travis", "Lisa", "Kenneth", "Bryan", "Lindsey", "Kristen", "Jose", "Alexander", "Jesse", "Katie", "Lindsay", "Shannon", "Vanessa", "Courtney", "Christine", "Alicia", "Cody", "Allison", "Bradley", "Samuel", "Shawn", "April", "Derek", "Kathryn", "Kristin", "Chad", "Jenna", "Tara", "Maria", "Krystal", "Jared", "Anna", "Edward", "Julie", "Peter", "Holly", "Marcus", "Kristina", "Natalie", "Jordan", "Victoria", "Jacqueline", "Corey", "Keith", "Monica", "Juan", "Donald", "Cassandra", "Meghan", "Joel", "Shane", "Phillip", "Patricia", "Brett", "Ronald", "Catherine", "George", "Antonio", "Cynthia", "Stacy", "Kathleen", "Raymond", "Carlos", "Brandi", "Douglas", "Nathaniel", "Ian", "Craig", "Brandy", "Alex", "Valerie", "Veronica", "Cory", "Whitney", "Gary", "Derrick", "Philip", "Luis", "Diana", "Chelsea", "Leslie", "Caitlin", "Leah", "Natasha", "Erika", "Casey", "Latoya", "Erik", "Dana", "Victor", "Brent", "Dominique", "Frank", "Brittney", "Evan", "Gabriel", "Julia", "Candice", "Karen", "Melanie", "Adrian", "Stacey", "Margaret", "Sheena", "Wesley", "Vincent", "Alexandra", "Katrina", "Bethany", "Nichole", "Larry", "Jeffery", "Curtis", "Carrie", "Todd", "Blake", "Christian", "Randy", "Dennis", "Alison", "Trevor", "Seth", "Kara", "Joanna", "Rachael", "Luke", "Felicia", "Brooke", "Austin", "Candace", "Jasmine", "Jesus", "Alan", "Susan", "Sandra", "Tracy", "Kayla", "Nancy", "Tina", "Krystle", "Russell", "Jeremiah", "Carl", "Miguel", "Tony", "Alexis", "Gina", "Jillian", "Pamela", "Mitchell", "Hannah", "Renee", "Denise", "Molly", "Jerry", "Misty", "Mario", "Johnathan", "Jaclyn", "Brenda", "Terry", "Lacey", "Shaun", "Devin", "Heidi", "Troy", "Lucas", "Desiree", "Jorge", "Andre", "Morgan", "Drew", "Sabrina", "Miranda", "Alyssa", "Alisha", "Teresa", "Johnny", "Meagan", "Allen", "Krista", "Marc", "Tabitha", "Lance", "Ricardo", "Martin", "Chase", "Theresa", "Melinda", "Monique", "Tanya", "Linda", "Kristopher", "Bobby", "Caleb", "Ashlee", "Kelli", "Henry", "Garrett", "Mallory", "Jill", "Jonathon", "Kristy", "Anne", "Francisco", "Danny", "Robin", "Lee", "Tamara", "Manuel", "Meredith", "Colleen", "Lawrence", "Christy", "Ricky", "Randall", "Marissa", "Ross", "Mathew", "Jimmy", "Abigail", "Kendra", "Carolyn", "Billy", "Deanna", "Jenny", "Jon", "Albert", "Taylor", "Lori", "Rebekah", "Cameron", "Ebony", "Wendy", "Angel", "Micheal", "Kristi", "Caroline", "Colin", "Dawn", "Kari", "Clayton", "Arthur", "Roger", "Roberto", "Priscilla", "Darren", "Kelsey", "Clinton", "Walter", "Louis", "Barbara", "Isaac", "Cassie", "Grant", "Cristina", "Tonya", "Rodney", "Bridget", "Joe", "Cindy", "Oscar", "Willie", "Maurice", "Jaime", "Angelica", "Sharon", "Julian", "Jack", "Jay", "Calvin", "Marie", "Hector", "Kate", "Adrienne", "Tasha", "Michele", "Ana", "Stefanie", "Cara", "Alejandro", "Ruben", "Gerald", "Audrey", "Kristine", "Ann", "Shana", "Javier", "Katelyn", "Brianna", "Bruce", "Deborah", "Claudia", "Carla", "Wayne", "Roy", "Virginia", "Haley", "Brendan", "Janelle", "Jacquelyn", "Beth", "Edwin", "Dylan", "Dominic", "Latasha", "Darrell", "Geoffrey", "Savannah", "Reginald", "Carly", "Fernando", "Ashleigh", "Aimee", "Regina", "Mandy", "Sergio", "Rafael", "Pedro", "Janet", "Kaitlin", "Frederick", "Cheryl", "Autumn", "Tyrone", "Martha", "Omar", "Lydia", "Jerome", "Theodore", "Abby", "Neil", "Shawna", "Sierra", "Nina", "Tammy", "Nikki", "Terrance", "Donna", "Claire", "Cole", "Trisha", "Bonnie", "Diane", "Summer", "Carmen", "Mayra", "Jermaine", "Eddie", "Micah", "Marvin", "Levi", "Emmanuel", "Brad", "Taryn", "Toni", "Jessie", "Evelyn", "Darryl", "Ronnie", "Joy", "Adriana", "Ruth", "Mindy", "Spencer", "Noah", "Raul", "Suzanne", "Sophia", "Dale", "Jodi", "Christie", "Raquel", "Naomi", "Kellie", "Ernest", "Jake", "Grace", "Tristan", "Shanna", "Hilary", "Eduardo", "Ivan", "Hillary", "Yolanda", "Alberto", "Andres", "Olivia", "Armando", "Paula", "Amelia", "Sheila", "Rosa", "Robyn", "Kurt", "Dane", "Glenn", "Nicolas", "Gloria", "Eugene", "Logan", "Steve", "Ramon", "Bryce", "Tommy", "Preston", "Keri", "Devon", "Alana", "Marisa", "Melody", "Rose", "Barry", "Marco", "Karl", "Daisy", "Leonard", "Randi", "Maggie", "Charlotte"};
        return Arrays.asList(arr);
    }

    public List<String> getLasNames() {
        String[] arr = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy", "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", "Peterson", "Gray", "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes", "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores", "Washington", "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz", "Hayes", "Myers", "Ford", "Hamilton", "Graham", "Sullivan", "Wallace", "Woods", "Cole", "West", "Jordan", "Owens", "Reynolds", "Fisher", "Ellis", "Harrison", "Gibson", "Mcdonald", "Cruz", "Marshall", "Ortiz", "Gomez", "Murray", "Freeman", "Wells", "Webb", "Simpson", "Stevens", "Tucker", "Porter", "Hunter", "Hicks", "Crawford", "Henry", "Boyd", "Mason", "Morales", "Kennedy", "Warren", "Dixon", "Ramos", "Reyes", "Burns", "Gordon", "Shaw", "Holmes", "Rice", "Robertson", "Hunt", "Black", "Daniels", "Palmer", "Mills", "Nichols", "Grant", "Knight", "Ferguson", "Rose", "Stone", "Hawkins", "Dunn", "Perkins", "Hudson", "Spencer", "Gardner", "Stephens", "Payne", "Pierce", "Berry", "Matthews", "Arnold", "Wagner", "Willis", "Ray", "Watkins", "Olson", "Carroll", "Duncan", "Snyder", "Hart", "Cunningham", "Bradley", "Lane", "Andrews", "Ruiz", "Harper", "Fox", "Riley", "Armstrong", "Carpenter", "Weaver", "Greene", "Lawrence", "Elliott", "Chavez", "Sims", "Austin", "Peters", "Kelley", "Franklin", "Lawson", "Fields", "Gutierrez", "Ryan", "Schmidt", "Carr", "Vasquez", "Castillo", "Wheeler", "Chapman", "Oliver", "Montgomery", "Richards", "Williamson", "Johnston", "Banks", "Meyer", "Bishop", "Mccoy", "Howell", "Alvarez", "Morrison", "Hansen", "Fernandez", "Garza", "Harvey", "Little", "Burton", "Stanley", "Nguyen", "George", "Jacobs", "Reid", "Kim", "Fuller", "Lynch", "Dean", "Gilbert", "Garrett", "Romero", "Welch", "Larson", "Frazier", "Burke", "Hanson", "Day", "Mendoza", "Moreno", "Bowman", "Medina", "Fowler", "Brewer", "Hoffman", "Carlson", "Silva", "Pearson", "Holland", "Douglas", "Fleming", "Jensen", "Vargas", "Byrd", "Davidson", "Hopkins", "May", "Terry", "Herrera", "Wade", "Soto", "Walters", "Curtis", "Neal", "Caldwell", "Lowe", "Jennings", "Barnett", "Graves", "Jimenez", "Horton", "Shelton", "Barrett", "Obrien", "Castro", "Sutton", "Gregory", "Mckinney", "Lucas", "Miles", "Craig", "Rodriquez", "Chambers", "Holt", "Lambert", "Fletcher", "Watts", "Bates", "Hale", "Rhodes", "Pena", "Beck", "Newman", "Haynes", "Mcdaniel", "Mendez", "Bush", "Vaughn", "Parks", "Dawson", "Santiago", "Norris", "Hardy", "Love", "Steele", "Curry", "Powers", "Schultz", "Barker", "Guzman", "Page", "Munoz", "Ball", "Keller", "Chandler", "Weber", "Leonard", "Walsh", "Lyons", "Ramsey", "Wolfe", "Schneider", "Mullins", "Benson", "Sharp", "Bowen", "Daniel", "Barber", "Cummings", "Hines", "Baldwin", "Griffith", "Valdez", "Hubbard", "Salazar", "Reeves", "Warner", "Stevenson", "Burgess", "Santos", "Tate", "Cross", "Garner", "Mann", "Mack", "Moss", "Thornton", "Dennis", "Mcgee", "Farmer", "Delgado", "Aguilar", "Vega", "Glover", "Manning", "Cohen", "Harmon", "Rodgers", "Robbins", "Newton", "Todd", "Blair", "Higgins", "Ingram", "Reese", "Cannon", "Strickland", "Townsend", "Potter", "Goodwin", "Walton", "Rowe", "Hampton", "Ortega", "Patton", "Swanson", "Joseph", "Francis", "Goodman", "Maldonado", "Yates", "Becker", "Erickson", "Hodges", "Rios", "Conner", "Adkins", "Webster", "Norman", "Malone", "Hammond", "Flowers", "Cobb", "Moody", "Quinn", "Blake", "Maxwell", "Pope", "Floyd", "Osborne", "Paul", "Mccarthy", "Guerrero", "Lindsey", "Estrada", "Sandoval", "Gibbs", "Tyler", "Gross", "Fitzgerald", "Stokes", "Doyle", "Sherman", "Saunders", "Wise", "Colon", "Gill", "Alvarado", "Greer", "Padilla", "Simon", "Waters", "Nunez", "Ballard", "Schwartz", "Mcbride", "Houston", "Christensen", "Klein", "Pratt", "Briggs", "Parsons", "Mclaughlin", "Zimmerman", "French", "Buchanan", "Moran", "Copeland", "Roy", "Pittman", "Brady", "Mccormick", "Holloway", "Brock", "Poole", "Frank", "Logan", "Owen", "Bass", "Marsh", "Drake", "Wong", "Jefferson", "Park", "Morton", "Abbott", "Sparks", "Patrick", "Norton", "Huff", "Clayton", "Massey", "Lloyd", "Figueroa", "Carson", "Bowers", "Roberson", "Barton", "Tran", "Lamb", "Harrington", "Casey", "Boone", "Cortez", "Clarke", "Mathis", "Singleton", "Wilkins", "Cain", "Bryan", "Underwood", "Hogan", "Mckenzie", "Collier", "Luna", "Phelps", "Mcguire", "Allison", "Bridges", "Wilkerson", "Nash", "Summers", "Atkins"};
        return Arrays.asList(arr);
    }

    @Test
    void testFindAllStudents() {
        repo.findAllStudents().forEach(System.out::println);
    }

    @Test
    void findPartialData() {
        repo.findStudentsPartialData().forEach(objects -> {
            System.out.println(objects[0] + "\t" + objects[1]);
        });
    }

    @Test
    void getStudentByFirstName() {
        repo.getStudentByFirstName("Daisy").forEach(System.out::println);
    }

    @Test
    void getStudentsInScoreRange() {
        repo.getStudentsInScoreRange(79, 81).forEach(System.out::println);
    }

    @Test
    @Transactional
    @Rollback(value = false)
    void deleteStudentsByFirstName() {
        repo.deleteStudentsByFirstName("Adriana");
    }
}
