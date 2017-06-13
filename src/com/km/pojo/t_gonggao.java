package com.km.pojo;

public class t_gonggao {
	// 1.公告的编号、标题、内容、日期；
	private int gonggao_id;
	private String gonggao_title;
	private String gonggao_content;
	private String gonggao_data;

	// 2.get set 方法；
	public int getGonggao_id() {
		return gonggao_id;
	}

	public void setGonggao_id(int gonggao_id) {
		this.gonggao_id = gonggao_id;
	}

	public String getGonggao_title() {
		return gonggao_title;
	}

	public void setGonggao_title(String gonggao_title) {
		this.gonggao_title = gonggao_title;
	}

	public String getGonggao_content() {
		return gonggao_content;
	}

	public void setGonggao_content(String gonggao_content) {
		this.gonggao_content = gonggao_content;
	}

	public String getGonggao_data() {
		return gonggao_data;
	}

	public void setGonggao_data(String gonggao_data) {
		this.gonggao_data = gonggao_data;
	}

	// 3.hash code 方法；
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gonggao_content == null) ? 0 : gonggao_content.hashCode());
		result = prime * result + ((gonggao_data == null) ? 0 : gonggao_data.hashCode());
		result = prime * result + gonggao_id;
		result = prime * result + ((gonggao_title == null) ? 0 : gonggao_title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		t_gonggao other = (t_gonggao) obj;
		if (gonggao_content == null) {
			if (other.gonggao_content != null)
				return false;
		} else if (!gonggao_content.equals(other.gonggao_content))
			return false;
		if (gonggao_data == null) {
			if (other.gonggao_data != null)
				return false;
		} else if (!gonggao_data.equals(other.gonggao_data))
			return false;
		if (gonggao_id != other.gonggao_id)
			return false;
		if (gonggao_title == null) {
			if (other.gonggao_title != null)
				return false;
		} else if (!gonggao_title.equals(other.gonggao_title))
			return false;
		return true;
	}

	// 4.无参构造方法；
	public t_gonggao() {
	}

	// 5.有参构造方法；
	public t_gonggao(int gonggao_id, String gonggao_title, String gonggao_content, String gonggao_data) {
		super();
		this.gonggao_id = gonggao_id;
		this.gonggao_title = gonggao_title;
		this.gonggao_content = gonggao_content;
		this.gonggao_data = gonggao_data;
	}

	// 6.to string 方法；
	@Override
	public String toString() {
		return "t_gonggao [gonggao_id=" + gonggao_id + ", gonggao_title=" + gonggao_title + ", gonggao_content="
				+ gonggao_content + ", gonggao_data=" + gonggao_data + "]";
	}

}
