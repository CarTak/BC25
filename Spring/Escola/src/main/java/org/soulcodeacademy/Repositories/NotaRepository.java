package org.soulcodeacademy.Repositories;

import org.soulcodeacademy.Domain.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Integer> {
}
