public class main {
    public static void main(String[] args) {
        studentDao studentDao = new studentDao();
        studentDao.addstudent();
        studentDao.addstudent();
        studentDao.printnames();
        studentDao.searchName();
        studentDao.searchnamebyindex();
        studentDao.removename();
        studentDao.printnames();

    }
}
