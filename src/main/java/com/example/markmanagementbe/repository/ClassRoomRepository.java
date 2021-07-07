package com.example.markmanagementbe.repository;

import com.example.markmanagementbe.model.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends JpaRepository<ClassRoom,Long> {
}
