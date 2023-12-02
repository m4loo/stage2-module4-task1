//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mjc.stage2;

public class Employee {
    private String name;
    private String lastName;
    private String position;
    private String phone;
    private String email;
    private String carNumber;

    public Employee() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarNumber() {
        return this.carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Employee)) {
            return false;
        } else {
            Employee other = (Employee)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                Object this$lastName = this.getLastName();
                Object other$lastName = other.getLastName();
                if (this$lastName == null) {
                    if (other$lastName != null) {
                        return false;
                    }
                } else if (!this$lastName.equals(other$lastName)) {
                    return false;
                }

                Object this$position = this.getPosition();
                Object other$position = other.getPosition();
                if (this$position == null) {
                    if (other$position != null) {
                        return false;
                    }
                } else if (!this$position.equals(other$position)) {
                    return false;
                }

                label62: {
                    Object this$phone = this.getPhone();
                    Object other$phone = other.getPhone();
                    if (this$phone == null) {
                        if (other$phone == null) {
                            break label62;
                        }
                    } else if (this$phone.equals(other$phone)) {
                        break label62;
                    }

                    return false;
                }

                label55: {
                    Object this$email = this.getEmail();
                    Object other$email = other.getEmail();
                    if (this$email == null) {
                        if (other$email == null) {
                            break label55;
                        }
                    } else if (this$email.equals(other$email)) {
                        break label55;
                    }

                    return false;
                }

                Object this$carNumber = this.getCarNumber();
                Object other$carNumber = other.getCarNumber();
                if (this$carNumber == null) {
                    if (other$carNumber != null) {
                        return false;
                    }
                } else if (!this$carNumber.equals(other$carNumber)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Employee;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $lastName = this.getLastName();
        result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
        Object $position = this.getPosition();
        result = result * 59 + ($position == null ? 43 : $position.hashCode());
        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $carNumber = this.getCarNumber();
        result = result * 59 + ($carNumber == null ? 43 : $carNumber.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getName();
        return "Employee(name=" + var10000 + ", lastName=" + this.getLastName() + ", position=" + this.getPosition() + ", phone=" + this.getPhone() + ", email=" + this.getEmail() + ", carNumber=" + this.getCarNumber() + ")";
    }

    public static class EmployeeBuilder {
        private final Employee employee = new Employee();

        public EmployeeBuilder() {
        }

        public EmployeeBuilder setName(String name) {
            this.employee.setName(name);
            return this;
        }

        public EmployeeBuilder setLastName(String lastName) {
            this.employee.setLastName(lastName);
            return this;
        }

        public EmployeeBuilder setPosition(String position) {
            this.employee.setPosition(position);
            return this;
        }

        public EmployeeBuilder setPhone(String phone) {
            this.employee.setPhone(phone);
            return this;
        }

        public EmployeeBuilder setEmail(String email) {
            this.employee.setEmail(email);
            return this;
        }

        public EmployeeBuilder setCarNumber(String carNumber) {
            this.employee.setCarNumber(carNumber);
            return this;
        }

        public Employee build() {
            return this.employee;
        }
    }
}
