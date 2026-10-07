package society_complaint_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import society_complaint_management.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}