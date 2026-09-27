package lk.jiat.web.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "refresh_token",indexes = {
        @Index(columnList = "token",unique = true),
        @Index(columnList = "username")
})
@NamedQueries({
        @NamedQuery(name = "RefreshToken.findByValidToken",
                query = "SELECT rf FROM RefreshToken rf WHERE rf.token=:token AND rf.expiryAt > :now"),

        @NamedQuery(name = "RefreshToken.deleteToken",query = "DELETE FROM RefreshToken rf WHERE rf.token=:token"),

        @NamedQuery(name = "RefreshToken.deleteExpiredToken",
        query = "DELETE FROM RefreshToken rf WHERE rf.expiryAt < :now")
})
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String token;

    private String username;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public RefreshToken(String username, String token, Instant expiryAt) {
        this.username = username;
        this.token = token;
        this.expiryAt = expiryAt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RefreshToken() {
    }

    public Instant getExpiryAt() {
        return expiryAt;
    }

    public void setExpiryAt(Instant expiryAt) {
        this.expiryAt = expiryAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    private Instant expiryAt;

    private Instant createdAt = Instant.now();
}
