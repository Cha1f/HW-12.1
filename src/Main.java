public class Main {
    public static void main(String[] args) {

        Book theFirstBook = new Book("Война и мир", "Лев толстой", 1880);
        Book theSecondBook = new Book("Мастер и Маргарита", "Михаил Булгаков", 1966);

        Author theFirstAuthor = new Author("Иван", "Тургенев");
        Author theSecondAuthor = new Author("Александр", "Пушкин");

        System.out.println("theFirstBook.nameBook = " + theFirstBook.getNameBook());
        System.out.println("theFirstBook.nameAuthor = " + theFirstBook.getNameAuthor());
        System.out.println("theFirstBook.publishingYear = " + theFirstBook.getPublishingYear());
        theFirstBook.setPublishingYear(1885);
        System.out.println();
        System.out.println("theSecondBook = " + theSecondBook.getNameBook());
        System.out.println("theSecondBook = " + theSecondBook.getNameAuthor());
        System.out.println("theSecondBook = " + theSecondBook.getPublishingYear());
        System.out.println();
        System.out.println("theFirstAuthor = " + theFirstAuthor.getTheFirstNameAuthor());
        System.out.println("theFirstAuthor = " + theFirstAuthor.getTheSecondNameAuthor());
        System.out.println();
        System.out.println("theSecondAuthor = " + theSecondAuthor.getTheFirstNameAuthor());
        System.out.println("theSecondAuthor = " + theSecondAuthor.getTheSecondNameAuthor());
    }


}