import java.time.LocalDate;
import java.time.Period;

public class User {
        private String name;
        private String surname;
        private String mail;
        private String number;

        void setName(String name) throws Exception {
            this.name = name;

            if(name==null){
                throw new Exception("Please write your name it is necessary");

            }

        }

        String getName() {
            return name;
        }



        void setSurname(String surname) throws Exception {
            this.surname=surname;

            if(surname==null){
                throw new Exception("Please write your surname it is necessary");
            }
        }

        String getSurname(){
            return surname;
        }


        public  LocalDate dateOfBirthday;

       void setDateOfBirthday(String dateOfBirthday){
           this.dateOfBirthday=LocalDate.parse(dateOfBirthday);
       }

        String getDateOfBirthday(){
           return dateOfBirthday.toString();
        }


        public int getAge(){
            return Period.between(this.dateOfBirthday, LocalDate.now()).getYears(); //Format daty rok-miesiąc-dzień
        }
            void setMail(String mail) throws Exception {
                this.mail=mail;
                if (mail == null) {
                    throw new Exception("Remember to upload your mail later");
                }
            }

            String setNumber(String number) throws Exception {
                this.number=number;
                if (number == null) {
                    throw new Exception("Remember to upload number later");
                }
                return number;
            }
        }



