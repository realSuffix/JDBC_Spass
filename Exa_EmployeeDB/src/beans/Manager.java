/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.time.LocalDate;

/**
 *
 * @author martin
 */
public class Manager {
    private String firstname;
    private String lastname;
    
    private LocalDate fromDate;
    private LocalDate toDate;

    public Manager(String firstname, String lastname, LocalDate fromDate, LocalDate toDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }
}
