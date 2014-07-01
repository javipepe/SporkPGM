package in.parapengu.spork.exception.map;

import in.parapengu.spork.map.SporkMap;

public class MapLoadException extends Exception {

	private static final long serialVersionUID = 1482787630528188112L;

	private String reason;

	public MapLoadException(SporkMap map, String reason) {
		super("Failed to load " + map.getName() + ": " + reason);
		this.reason = reason;
	}

	public MapLoadException(SporkMap map, Exception exception) {
		this(map, exception.getClass().getSimpleName() + (exception.getMessage() == null || exception.getMessage().length() <= 0 ? "" : ": " + exception.getMessage()));
	}

	public String getReason() {
		return reason;
	}

}
