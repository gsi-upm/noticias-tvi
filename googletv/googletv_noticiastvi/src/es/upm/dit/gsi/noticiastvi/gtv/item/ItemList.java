//   Copyright 2011 UPM-GSI: Group of Intelligent Systems -
//   - Universidad Politécnica de Madrid (UPM)
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package es.upm.dit.gsi.noticiastvi.gtv.item;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * List of items to pass between activities/fragments.
 * 
 * @author Antonio Prada <toniprada@gmail.com>
 * 
 */
public class ItemList implements Serializable {
	
	public static final String EXTRA = "es.upm.dit.gsit.noticiastvi.gtv.video.VideoList";
	
	private static final long serialVersionUID = 4927417847969379742L;
	
	private ArrayList<Item> videos;
	private int selected;
	
	public ItemList(ArrayList<Item> videos , int selected) {
		setVideos(videos);
		setSelected(selected);
	}
	
	public ArrayList<Item> getVideos() {
		return videos;
	}
	public void setVideos(ArrayList<Item> videos) {
		this.videos = videos;
	}
	public int getSelected() {
		return selected;
	}
	
	public boolean setSelected(int selected) {
		if (selected >= 0 && selected < videos.size()) {
			this.selected = selected;
			return true;
		} else {
			return false;
		}
	}
	
	public Item getSelectedItem() {
		return videos.get(selected);
	}
	
	

}
