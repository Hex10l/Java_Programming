public class Main {
    public static void main(String[] args) {
        goodDay.setTemp(goodDay.getTemp());
        goodDay.setHumidity(goodDay.getHumidity());
        goodDay.setHomeworkStatus(goodDay.homeworkCheck());
        goodDay.setDinnerMeal(goodDay.getDinnerMeal());
        System.out.println(goodDay.todayStatus(goodDay.isTodayGood()));
        System.out.println(goodDay.weatherStatus(goodDay.isWeatherGood()));
    }
}