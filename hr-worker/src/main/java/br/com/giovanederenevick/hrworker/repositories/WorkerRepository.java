package br.com.giovanederenevick.hrworker.repositories;

import br.com.giovanederenevick.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
