/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


import org.hibernate.annotations.GeneratorType;
;


/**
 *
 * @author Snof_Bo
 */
@Entity
@NamedQuery(name = "findAllSalle", query = "from Salle")
@NamedNativeQuery(name = "findAllNativeSalle", query = "select * from salle", resultClass = Salle.class)
public class Salle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    @OneToMany(mappedBy = "salle",fetch = FetchType.EAGER)
    private List<Machine> machines;

    public Salle() {
    }
    public Salle(String code, List<Machine> machines) {
        this.code = code;
        this.machines = machines;
    }
    public Salle(String code) {
        this.code = code;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
    public String getMachinesRef(){
        String names="";
        for(Machine m: machines){
            names +="\n-"+m.getRef();
        }
        return names;
    }
    
    @Override
    public String toString() {
        return "Salle{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", machines=" + machines +
                '}';
    }
}
