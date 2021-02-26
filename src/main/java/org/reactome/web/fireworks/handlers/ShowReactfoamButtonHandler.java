package org.reactome.web.fireworks.handlers;

import org.reactome.web.fireworks.events.ShowReactfoamButtonEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ShowReactfoamButtonHandler extends EventHandler{
	void onToggleReactfoamButton(ShowReactfoamButtonEvent toggleReactfoamButtonEvent);
}
