package com.example.todoapp.repository;
import java.util.List;
import com.example.todoapp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Find all completed tasks
    List<Task> findByCompleted(boolean completed);

    // Find tasks by title
    List<Task> findByTitle(String title);

    // Search title containing keyword
    List<Task> findByTitleContaining(String keyword);

    // Check if task exists
    boolean existsByTitle(String title);
}