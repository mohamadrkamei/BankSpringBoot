package model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "account")
public class account {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "account_id", unique = true, nullable = false)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
