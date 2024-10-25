class CustomFileNotFoundException extends Exception {
    public CustomFileNotFoundException(String message) {
        super(message);
    }

    public CustomFileNotFoundException() {
        super("Файл не найден");
    }
}

