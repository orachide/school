<div class="alert alert-block alert-success">
	<button type="button" class="close" data-dismiss="alert"><i class="icon-remove"></i></button>
	<i class="icon-ok green"></i> Welcome to <strong class="green">Ace <small>(v{{! site.version}})</small></strong>,
	the lightweight, feature-rich and easy to use admin template.
</div>


<div class="row">
 <div class="space-6"></div>

 <div class="col-sm-7 infobox-container">
	{{! #page.stats1}}
	 {{! > page.infobox}}
	{{! /page.stats1}}
	<div class="space-6"></div>
	{{! #page.stats2}}
	 {{! > page.infobox}}
	{{!/page.stats2}}
 </div>

 <div class="vspace-sm"></div>

 <div class="col-sm-5">

	<div class="widget-box">
		<div class="widget-header widget-header-flat widget-header-small">
			<h5><i class="icon-signal"></i> Traffic Sources</h5>
			<div class="widget-toolbar no-border">
				<button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown">
					This Week <i class="icon-angle-down icon-on-right bigger-110"></i>
				</button>
				<ul class="dropdown-menu pull-right dropdown-125 dropdown-lighter dropdown-caret">
					<li class="active">
						<a href="#" class="blue">
							<i class="icon-caret-right bigger-110">&nbsp;</i> This Week
						</a>
					</li>
					<li><a href="#"><i class="icon-caret-right bigger-110 invisible">&nbsp;</i> Last Week</a></li>
					<li><a href="#"><i class="icon-caret-right bigger-110 invisible">&nbsp;</i> This Month</a></li>
					<li><a href="#"><i class="icon-caret-right bigger-110 invisible">&nbsp;</i> Last Month</a></li>
				</ul>
			</div>
		</div>
		
		<div class="widget-body">
		 <div class="widget-main">
			<div id="piechart-placeholder"></div>
			
			<div class="hr hr8 hr-double"></div>
			
			<div class="clearfix">
				<div class="grid3">
					<span class="grey"><i class="icon-facebook-sign icon-2x blue"></i> &nbsp; likes</span>
					<h4 class="bigger pull-right">1,255</h4>
				</div>
				
				<div class="grid3">
					<span class="grey"><i class="icon-twitter-sign icon-2x purple"></i> &nbsp; tweets</span>
					<h4 class="bigger pull-right">941</h4>
				</div>
				
				<div class="grid3">
					<span class="grey"><i class="icon-pinterest-sign icon-2x red"></i> &nbsp; pins</span>
					<h4 class="bigger pull-right">1,050</h4>
				</div>
			</div>
		 </div><!--/widget-main-->
		</div><!--/widget-body-->
	</div><!--/widget-box-->


 </div><!--/span-->
 

</div><!--/row-->


<div class="hr hr32 hr-dotted"></div>


<div class="row">


	<div class="col-sm-5">
		<div class="widget-box transparent">
			<div class="widget-header widget-header-flat">
				<h4 class="lighter"><i class="icon-star orange"></i>Popular Domains</h4>
				<div class="widget-toolbar">
					<a href="#" data-action="collapse"><i class="icon-chevron-up"></i></a>
				</div>
			</div>
			
			<div class="widget-body">
			 <div class="widget-main no-padding">
				{{! > page.domains}}
			 </div><!--/widget-main-->
			</div><!--/widget-body-->
		</div><!--/widget-box-->
	</div>


	
	<div class="col-sm-7">
	  <div class="widget-box transparent">
		<div class="widget-header widget-header-flat">
			<h4 class="lighter"><i class="icon-signal"></i> Sale Stats</h4>
			<div class="widget-toolbar">
				<a href="#" data-action="collapse"><i class="icon-chevron-up"></i></a>
			</div>
		</div>
		
		<div class="widget-body">
		 <div class="widget-main padding-4">
			<div id="sales-charts"></div>
		 </div><!--/widget-main-->
		</div><!--/widget-body-->
	  </div><!--/widget-box-->
	</div>

</div>



<div class="hr hr32 hr-dotted"></div>



<div class="row">

 <div class="col-sm-6">
	<div class="widget-box transparent" id="recent-box">
		
		<div class="widget-header">
			<h4 class="lighter smaller"><i class="icon-rss orange"></i>RECENT</h4>
			<div class="widget-toolbar no-border">
				<ul class="nav nav-tabs" id="recent-tab">
					<li class="active"><a data-toggle="tab" href="#task-tab">Tasks</a></li>
					<li><a data-toggle="tab" href="#member-tab">Members</a></li>
					<li><a data-toggle="tab" href="#comment-tab">Comments</a></li>
				</ul>
			</div>
		</div>

		<div class="widget-body">
		 <div class="widget-main padding-4">
			<div class="tab-content padding-8 overflow-visible">{{! overflow visible for when dragging tasks around }}
				<div id="task-tab" class="tab-pane active">
					<h4 class="smaller lighter green"><i class="icon-list"></i> Sortable Lists</h4>
					{{!> page.tasks}}
				</div>


				<div id="member-tab" class="tab-pane">
					{{! > page.members}}
				</div><!-- member-tab -->


				<div id="comment-tab" class="tab-pane">
					{{! > page.comments}}
				</div>
			</div>
		 </div><!--/widget-main-->
		</div><!--/widget-body-->


	</div><!--/widget-box-->
 </div><!--/span-->
 
 <div class="col-sm-6">
	<div class="widget-box ">
		
		<div class="widget-header">
			<h4 class="lighter smaller"><i class="icon-comment blue"></i>Conversation</h4>
		</div>
		
		<div class="widget-body">
		 <div class="widget-main no-padding">
			{{! > page.conversations}}
		 </div><!--/widget-main-->
		</div><!--/widget-body-->
		
	</div><!--/widget-box-->
 </div><!--/span-->

</div><!--/row-->

