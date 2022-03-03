package me.whiteship.demospringmvc;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@Entity
@XmlRootElement
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
