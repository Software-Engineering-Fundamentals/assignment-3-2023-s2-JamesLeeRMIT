package Parent_folder_Group_36;

public static void Main(Strings args[]) {
    manager TestManager = new manager("Jones Jacobs", "email@email.com", "password", "0400000000", "E00001");
    student TestStudent = new student("Bob Bacobs", "Studentemail@email.com", "password", "0400000001", "S00001", LocalDate.of(2002, 11, 24));

    TestManager.appendStudent(TestStudent);
}