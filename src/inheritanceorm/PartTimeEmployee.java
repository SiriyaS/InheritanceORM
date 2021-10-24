/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceorm;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author siriya_s
 */
@Entity
public class PartTimeEmployee extends Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int hoursWork;

    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    
}
