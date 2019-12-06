package ai.h2o.automl.leaderboard;

public class LeaderboardColumn {

    private final String _name;
    private final String _columnType;
    private final String _columnFormat;

    public LeaderboardColumn(String name, String columnType, String columnFormat) {
        _name = name;
        _columnType = columnType;
        _columnFormat = columnFormat;
    }

    public String getName() { return _name; }
    public String getColumnType() { return _columnType; }
    public String getColumnFormat() { return _columnFormat; }
}