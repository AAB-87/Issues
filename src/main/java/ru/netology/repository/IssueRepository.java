package ru.netology.repository;

import ru.netology.domain.Issue;
import java.util.ArrayList;
import java.util.Collection;


public class IssueRepository {
    private Collection<Issue> issues = new ArrayList<>(); // создаём список (ArrayList) для хранения объектов в интерфейсе Collection

    public Collection<Issue> getAll() { // получение всех issues
        return issues; // при вызове метода возвращать массив всех issues
    }

    public void save(Issue issue) { // вся реализация прописана в ArrayList
        issues.add(issue); // передаём сюда issue который получили на вход
    }

    public void removeByTag(int tag) { // удаление по Tэгу
        issues.removeIf(issue -> issue.getTag == tag); // удалить если id тэга который есть в коллекции обладает таким же id который мы передали
    }

    public void removeById(int id) { // удаление по id
        issues.removeIf(issue -> issue.getId == id); // удалить если id который есть в коллекции обладает таким же id который мы передали
    }

    public Issue findById(int id) { // поиск issue по идентификатору
        for (Issue issue : issues) { // перебираем все ячейки старого набора
            if (issue.getId() == id) { // если находится необходимый идентификатор
                return issue;
            }
        }
        return null;

//    public Collection<Issue> getOpenIssue() {
//        return issues;
//    }
//
//    public Collection<Issue> getCloseIssue() {
//        return issues;
//    }


}

