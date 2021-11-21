package ru.netology.manager;

import java.util.Arrays;

import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;


public class IssueManager {
    private final IssueRepository repository;

    public IssueManager(IssueRepository repository) { // конструктор принимает параметром репозиторий
        this.repository = repository;
    }

    public void save(Issue issue) { // добавление issue в репозиторий
        repository.save(issue); // вызываем метод save у репозитория и добавляем туда issue
    }

    public Issue[] getAll() { // получение списка issues
        return repository.getAll().toArray(new Issue[0]); // запрашиваем у репозитория коллекцию issue с помощью метода getAll()
    }

//    public Issue[] getOpenIssue() { // получение списка открытых issues
//        return repository.getOpenIssue().toArray(new Issue[0]);
//    }
//
//    public Issue[] getCloseIssue() { // получение списка закрытых issues
//        return repository.getCloseIssue().toArray(new Issue[0]);
//    }

    public void removeById(int id) { // удаление issue по идентификатору
        repository.removeById(id); // у репозитория вызывается метод удаления
    }

    public void removeByTag(int tag) { // удаление issues по тегу
        repository.removeByTag(tag); // у репозитория вызывается метод удаления
    }

    public Issue[] searchBy(int id) {
        return repository.findById(id);
    }



}