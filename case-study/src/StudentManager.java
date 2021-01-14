import java.util.*;


public class StudentManager {
    Students st = new Students();
    Validate valid = new Validate();
    static StudentsIO studentsIO = new StudentsIO();
    static ArrayList<Students> studentList = new ArrayList<>();
    static ArrayList<Students> list = new ArrayList<>();
    static int idStudents = 1;

    static {
        studentsIO.readFromFile();
    }


    public void insertStudent() {
        String name = valid.validName("nhập tên học viên");
        String gender = valid.validGender("nhập giới tính : ");
        String dayOfBirth = valid.validDate("nhập ngày sinh : ");
        studentList.add(new Students(idStudents++, name, gender, dayOfBirth));
    }

    public void getStudentByName() {
        String name = valid.validName("nhập tên học viên cần tìm kiếm :");
        for (Students students : studentList) {
            if (students.getName().contains(name)) {
                list.add(students);
            }
        }
    }

    public void showList() {
        st.printHeader();
        for (Students students : list) {
            students.printStudent();
        }
    }

    public Students getStudentById() {
        while (true) {
            try {
                int id = valid.validInteger("nhập id học viên");
                for (Students st : list) {
                    if (st.getId() == id) {
                        return st;
                    }
                }
                System.out.println("id nằm ngoài danh sách !");
            } catch (Exception e) {
                return getStudentById();
            }
        }
    }

    public void editStudent() {
        getStudentByName();
        if (list.size() == 0) {
            System.out.println("không có học viên nào trong danh sách !");
            studentMenu();
        } else {
            showList();
            Students students = getStudentById();
            while (true) {
                System.out.println("1. sửa tên học viên");
                System.out.println("2. sửa giới tính");
                System.out.println("3. sửa ngày sinh");
                System.out.println("4. thoát");
                int choice = valid.validChoice("nhập sự lựa chọn của bạn : ", 1, 4);
                switch (choice) {
                    case 1 -> {
                        students.setName( valid.validName("nhập tên để sửa : "));
                        list.clear();
                    }
                    case 2 -> {
                        String gender = valid.validGender("nhập giới tính để sửa : ");
                        students.setGender(gender);
                        list.clear();
                    }
                    case 3 -> {
                        String dayOfBirth = valid.validDate("nhập ngày sinh để sửa : ");
                        students.setDayOfBirth(dayOfBirth);
                        list.clear();
                    }
                    case 4 -> {
                        studentMenu();
                        list.clear();
                    }
                }
            }
        }
    }

    public void showStudentList() {
        if (studentList.size() == 0) {
            System.out.println("không có học viên nào trong danh sách !");
        } else {
            studentList.sort(new Comparator<Students>() {
                @Override
                public int compare(Students o1, Students o2) {
                    return o1.getId() > o2.getId() ? 1 : -1;
                }
            });
            st.printHeader();
            for (Students students : studentList) {
                students.printStudent();
            }
        }
    }

    public void removeStudent() {
        getStudentByName();
        if (list.size() == 0) {
            System.out.println("không có học viên trong danh sách. Bạn có muốn tiếp tục thực hiện việc xóa học viên (N | Y) ?");
            if (valid.yesNo().equals("N")) {
                studentMenu();
            } else {
                removeStudent();
            }
        } else {
            showList();
            Students students = getStudentById();
            System.out.println("bạn có muốn xóa học viên (n | y) ?");
            if (valid.yesNo().equals("N")) {
                list.clear();
                studentMenu();
            } else {
                studentList.remove(students);
                list.clear();
                System.out.println("hoc vien " + students.getName() + " đã bị xóa khỏi danh sách");
            }
        }
    }

    public void addScore() {
        getStudentByName();
        if (list.size() == 0) {
            System.out.println("Không có học viên trong danh sách !");
            studentMenu();
        } else {
            showList();
            Students students = getStudentById();
            while (true) {
                System.out.println("1. nhập điểm lần 1");
                System.out.println("2. nhập điểm lần 2");
                System.out.println("3. nhập điểm lần 3");
                System.out.println("4. nhập điểm lần 4");
                System.out.println("5. thoát");
                int choice = valid.validChoice("nhập lựa chọn của bạn", 1, 6);
                switch (choice) {
                    case 1 -> {
                        if (students.getScoreOne() == -1) {
                            double scoreOne = valid.validPoints("nhập điểm lần 1:");
                            students.setScoreOne(scoreOne);
                            students.setMediumScore();
                        } else {
                            System.out.println("đã có điểm không thể nhập !");
                        }
                        list.clear();
                    }
                    case 2 -> {
                        if (students.getScoreTwo() == -1) {
                            double scoreTwo = valid.validPoints("nhập điểm lần 2 :");
                            students.setScoreTwo(scoreTwo);
                            students.setMediumScore();
                        } else {
                            System.out.println("đã có điểm không thể nhập !");
                        }
                        list.clear();
                    }
                    case 3 -> {
                        if (students.getScoreThree() == -1) {
                            double scoreThree = valid.validPoints("nhập điểm lần 3 :");
                            students.setScoreThree(scoreThree);
                            students.setMediumScore();
                        } else {
                            System.out.println("đã có điểm không thể nhập !");
                        }
                        list.clear();
                    }
                    case 4 -> {
                        if (students.getScoreFour() == -1) {
                            double scoreFour = valid.validPoints("nhập điểm lần 4 :");
                            students.setScoreFour(scoreFour);
                            students.setMediumScore();
                        } else {
                            System.out.println("đã có điểm không thể nhập !");
                        }
                        list.clear();
                    }
                    case 5 -> {
                        studentMenu();
                        list.clear();
                    }
                }
            }
        }
    }

    public void addSeriesScoreOne() {
        for (Students st : studentList) {
            if (st.getScoreOne() == -1) {
                System.out.println("id : " + st.getId() + " | " + " name : " + st.getName());
                st.setScoreOne(valid.validPoints("nhập điểm lần 1"));
                st.setMediumScore();
            } else {
                System.out.println("học viên " + st.getName() + " đã có điểm");
            }
        }
    }

    public void addSeriesScoreTwo() {
        for (Students st : studentList) {
            if (st.getScoreTwo() == -1) {
                System.out.println("id : " + st.getId() + " | " + " name : " + st.getName());
                st.setScoreTwo(valid.validPoints("nhập điểm lần 2"));
                st.setMediumScore();
            } else {
                System.out.println("học viên " + st.getName() + " đã có điểm");
            }
        }
    }

    public void addSeriesScoreThree() {
        for (Students st : studentList) {
            if (st.getScoreThree() == -1) {
                System.out.println("id : " + st.getId() + " | " + " name : " + st.getName());
                st.setScoreThree(valid.validPoints("nhập điểm lần 3"));
                st.setMediumScore();
            } else {
                System.out.println("học viên " + st.getName() + " đã có điểm");
            }
        }
    }

    public void addSeriesScoreFour() {
        for (Students st : studentList) {
            if (st.getScoreFour() == -1) {
                System.out.println("id : " + st.getId() + " | " + " name : " + st.getName());
                st.setScoreFour(valid.validPoints("nhập điểm lần 4"));
                st.setMediumScore();
            } else {
                System.out.println("học viên " + st.getName() + " đã có điểm");
            }
        }
    }

    public void addSeriesScore() {
        while (true) {
            System.out.println("1. nhập điểm lần 1 của tất cả học sinh");
            System.out.println("2. nhập điểm lần 2 của tất cả học sinh");
            System.out.println("3. nhập điểm lần 3 của tất cả học sinh");
            System.out.println("4. nhập điểm lần 4 của tất cả học sinh");
            System.out.println("5. thoát");
            int choice;
            choice = valid.validChoice("nhập sự lưa chọn của bạn", 1, 5);
            switch (choice) {
                case 1 -> addSeriesScoreOne();
                case 2 -> addSeriesScoreTwo();
                case 3 -> addSeriesScoreThree();
                case 4 -> addSeriesScoreFour();
                case 5 -> studentMenu();
            }
        }
    }

    public void editScore() {
        getStudentByName();
        if (list.size() == 0) {
            System.out.println("không có học viên trong danh sách !");
            studentMenu();
        } else {
            showList();
            Students students = getStudentById();
            System.out.println("1. sửa điểm lần 1");
            System.out.println("2. sửa điểm lần 2");
            System.out.println("3. sửa điểm lần 3");
            System.out.println("4. sửa điểm lần 4");
            System.out.println("5. thoát");
            int choice = valid.validChoice("nhập sự lựa chọn của bạn", 1, 5);
            switch (choice) {
                case 1 -> {
                    if (students.getScoreOne() != -1) {
                        students.setScoreOne(valid.validPoints("sửa điểm lần 1"));
                        students.setMediumScore();
                    } else {
                        System.out.println("học viên chưa có điểm");
                    }
                    list.clear();
                }
                case 2 -> {
                    if (students.getScoreTwo() != -1) {
                        students.setScoreTwo(valid.validPoints("sửa điểm lần 2"));
                        students.setMediumScore();
                    } else {
                        System.out.println("học viên chưa có điểm");
                    }
                    list.clear();
                }
                case 3 -> {
                    if (students.getScoreThree() != -1) {
                        students.setScoreThree(valid.validPoints("sửa điểm lần 3"));
                        students.setMediumScore();
                    } else {
                        System.out.println("học viên chưa có điểm");
                    }
                    list.clear();
                }
                case 4 -> {
                    if (students.getScoreFour() != -1) {
                        students.setScoreFour(valid.validPoints("sửa điểm lần 4"));
                        students.setMediumScore();
                    } else {
                        System.out.println("học viên chưa có điểm");
                    }
                    list.clear();
                }
                case 5 -> {
                    studentMenu();
                    list.clear();
                }
            }
        }
    }

    public boolean checkScore() {
        for (Students st : studentList) {
            if (st.getScoreOne() == -1 || st.getScoreTwo() == -1 || st.getScoreThree() == -1 || st.getScoreFour() == -1) {
                return false;
            }
        }
        return true;
    }

    public void sortStudentList() {
        if (!checkScore()) {
            System.out.println("sinh viên chưa đủ điểm không thể sắp xếp");
        } else {
            studentList.sort(new Comparator<Students>() {
                @Override
                public int compare(Students o1, Students o2) {
                    return o1.getMediumScore() < o2.getMediumScore() ? 1 : -1;
                }
            });
            st.printHeader();
            for (Students st : studentList){
                st.printStudent();
            }
        }
    }


    public void studentMenu() {
        while (true) {
            System.out.println("1. xem danh sách học viên");
            System.out.println("2. thêm học viên");
            System.out.println("3. sửa học viên");
            System.out.println("4. xóa học viên");
            System.out.println("5. nhập điểm từng học viên");
            System.out.println("6. nhập điểm tất cả học viên");
            System.out.println("7. sửa điểm từng học viên");
            System.out.println("8. sắp xếp học viên");
            System.out.println("9. thoát");
            int choice;
            choice = valid.validChoice("nhập sự lựa chọn của bạn", 1, 9);

            switch (choice) {
                case 1 -> showStudentList();
                case 2 -> insertStudent();
                case 3 -> editStudent();
                case 4 -> removeStudent();
                case 5 -> addScore();
                case 6 -> addSeriesScore();
                case 7 -> editScore();
                case 8 -> sortStudentList();
                case 9 -> System.exit(0);
            }
            studentsIO.saveToFile();
        }
    }
}
