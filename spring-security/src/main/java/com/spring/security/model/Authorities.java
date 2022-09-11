/*
 * package com.spring.security.model;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.Id; import javax.persistence.OneToOne; import
 * javax.persistence.Table;
 * 
 * @Table(name = "authorities")
 * 
 * @Entity public class Authorities {
 * 
 * @Id
 * 
 * @Column(name = "username", nullable = false) private String username;
 * 
 * @Column(name = "authority", nullable = false) private String authority;
 * 
 * @OneToOne(mappedBy = "authorities") private Users users;
 * 
 * public Users getUsers() { return users; }
 * 
 * public void setUsers(Users users) { this.users = users; }
 * 
 * public String getUsername() { return username; }
 * 
 * public void setUsername(String username) { this.username = username; }
 * 
 * public String getAuthority() { return authority; }
 * 
 * public void setAuthority(String authority) { this.authority = authority; }
 * 
 * }
 */