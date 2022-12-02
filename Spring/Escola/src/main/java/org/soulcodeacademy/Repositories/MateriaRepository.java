package org.soulcodeacademy.Repositories;

import org.soulcodeacademy.Domain.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {
}
