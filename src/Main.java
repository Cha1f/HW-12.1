public class Main {
    public static void main(String[] args) {
        Author theFirstAuthor = new Author("Лев", "Толстой");
        Author theSecondAuthor = new Author("Михаил", "Булгаков");

        Book theFirstBook = new Book("Война и мир", 1880);
        Book theSecondBook = new Book("Мастер и Маргарита", 1960);

        System.out.println("theFirstAuthor = " + theFirstAuthor.getTheFirstNameAuthor());
        System.out.println("theFirstAuthor = " + theFirstAuthor.getTheSecondNameAuthor());
        System.out.println("theFirstBook = " + theFirstBook.getNameBook());
        System.out.println("theFirstBook = " + theFirstBook.getPublishingYear());
        theFirstBook.setPublishingYear(1885);
        System.out.println("theFirstBook = " + theFirstBook.getPublishingYear());
        System.out.println();
        System.out.println("theSecondAuthor = " + theSecondAuthor.getTheFirstNameAuthor());
        System.out.println("theSecondAuthor = " + theSecondAuthor.getTheSecondNameAuthor());
        System.out.println("theSecondBook = " + theSecondBook.getNameBook());
        System.out.println("theSecondBook = " + theSecondBook.getPublishingYear());
    }


}