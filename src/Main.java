public class Main {
    public static void main(String[] args) {
        Author theFirstAuthor = new Author("Лев", "Толстой");
        Author theSecondAuthor = new Author("Михаил", "Булгаков");
        System.out.println("theFirstAuthor.getTheFirstNameAuthor() = " + theFirstAuthor.getTheFirstNameAuthor());
        System.out.println("theFirstAuthor.getTheSecondNameAuthor() = " + theFirstAuthor.getTheSecondNameAuthor());
        System.out.println("theSecondAuthor.getTheFirstNameAuthor() = " + theSecondAuthor.getTheFirstNameAuthor());
        System.out.println("theSecondAuthor.getTheSecondNameAuthor() = " + theSecondAuthor.getTheSecondNameAuthor());


        Book theFirstBook = new Book("Война и мир", theFirstAuthor, 1880);
        Book theSecondBook = new Book("Мастер и Маргарита", theSecondAuthor, 1960);

        System.out.println("theFirstBook = " + theFirstBook.getNameBook());
        System.out.println("theFirstBook = " + theFirstBook.getNameAuthor());
        System.out.println("theFirstBook = " + theFirstBook.getPublishingYear());
        theFirstBook.setPublishingYear(1885);
        System.out.println("theFirstBook = " + theFirstBook.getPublishingYear());
        System.out.println();
        System.out.println("theSecondBook = " + theSecondBook.getNameBook());
        System.out.println("theSecondBook = " + theSecondBook.getNameAuthor());
        System.out.println("theSecondBook = " + theSecondBook.getPublishingYear());
    }


}